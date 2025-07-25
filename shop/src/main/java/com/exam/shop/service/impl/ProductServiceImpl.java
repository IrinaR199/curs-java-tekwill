package com.exam.shop.service.impl;

import com.exam.shop.dto.ProductDto;
import com.exam.shop.entity.Category;
import com.exam.shop.entity.Product;
import com.exam.shop.mappers.ProductMapper;
import com.exam.shop.repository.CategoryRepository;
import com.exam.shop.repository.ProductRepository;
import com.exam.shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.exam.shop.mappers.ProductMapper.toDto;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;


    @Override
    public ProductDto createProduct(ProductDto productDto) {
        Category category = getCategoryByName(productDto.getCategory());
        Product product = ProductMapper.toEntity(productDto, category); // convert dto to entity
        Product saved = productRepository.save(product); // save entity
        return toDto(saved); // convert saved entity back to dto
    }

    @Override
    public List<ProductDto> getAllProducts() {
        /*
        ProductDto productDto = ProductDto.builder()
                .title("Pen")
                .price(5.0)
                .description("for writing")
                .category("Stationery")
                .available(true)
                .build();

        ProductDto productDto1 = ProductDto.builder()
                .title("Notebook 1")
                .price(25.0)
                .description("24 pages")
                .category("Stationery")
                .available(false)
                .build();

        ProductDto productDto2 = ProductDto.builder()
                .title("Notebook 2")
                .price(18.0)
                .description("12 pages")
                .category("Stationery")
                .available(true)
                .build();

        return List.of(productDto,productDto1,productDto2);
         */
        return productRepository.findAll()
                .stream()
                .map(ProductMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> getAllProductsByCategoryId(Long categoryId) {

        List<Product> products = productRepository.findByCategoryId(categoryId);
        return products.stream()
                .map(ProductMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<ProductDto> getAllProductsByCategoryName(String categoryName) {
        return productRepository.findByCategoryTitle(categoryName).stream()
                .map(ProductMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto getProductById(Long id) {
        return productRepository.findById(id)
                .map(ProductMapper::toDto)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public List<ProductDto> getAllProductsByName(String title) {
        return productRepository.findProductByTitle(title).stream()
                .map(ProductMapper::toDto)
                .collect(Collectors.toList());
    }

//    @Override
//    public ProductDto updateProduct(Long id, ProductDto dto) {
//        Product product = productRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));
//        Category category = getCategoryByName(dto.getCategory());
//
//        ProductMapper.updateEntity(product, dto, category);
//
//        return ProductMapper.toDto(productRepository.save(product));
//    }

    @Override
    public ProductDto updateProduct(Long id, ProductDto dto) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with ID: " + id));

        Category category = getCategoryByName(dto.getCategory());
        ProductMapper.updateEntity(product, dto, category);
        return toDto(productRepository.save(product));
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    private Category getCategoryByName(String name) {
        return categoryRepository.findAll().stream()
                .filter(cat -> cat.getTitle().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Category not found: " + name));
    }
}
