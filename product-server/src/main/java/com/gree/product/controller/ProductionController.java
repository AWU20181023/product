package com.gree.product.controller;

import com.alibaba.fastjson.JSON;
import com.gree.product.dto.CartDto;
import com.gree.product.dto.ProductionOutput;
import com.gree.product.entity.dto.Result;
import com.gree.product.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class ProductionController {

    @Autowired
    private ProductionService productionService;

    @GetMapping("getList")
    public Result getList() {
        return new Result(0, "成功", JSON.toJSON(null));
    }

    @PostMapping("listForOrder")
    public List<ProductionOutput> listForOrder(@RequestBody List<String> productIdList) {
        productIdList.forEach(System.out::println);
        List<ProductionOutput> productionOutputs = new LinkedList<>();
        productionOutputs.add(new ProductionOutput(1, "test", 2d, "good price", "http://www.xxx.com"));
        return productionOutputs;
    }

    @PostMapping("decrementStock")
    private void decrementStock(@RequestBody List<CartDto> cartDtoList) {
        if (cartDtoList != null && cartDtoList.size() > 0) {
            for (CartDto cartDto : cartDtoList) {
                System.out.println(cartDto);
            }
        }
    }

//    private List<ProductionDtos> getCategories() {
//        List<ProductionDtos> productionDtosList = new LinkedList<>();
//        ProductionDtos productionDtos = new ProductionDtos();
//        List<Category> categories = new LinkedList<>();
//        List<Production> productions = new ArrayList<>();
//        Production production = new Production();
//        production.setDescription("好吃的皮蛋粥");
//        production.setName("皮蛋粥");
//        production.setPrice(1.2D);
//        production.setIcon("http://xxx.com");
//        production.setId(123456);
//        productions.add(production);
//        Category category = new Category();
//        category.setFoods(productions);
//        category.setType(1);
//        category.setName("热情");
//        categories.add(category);
//
//        production = new Production();
//        production.setDescription("美味爽口");
//        production.setName("慕斯蛋糕");
//        production.setPrice(10.9D);
//        production.setIcon("http://xxx.com");
//        production.setId(123457);
//        productions = new ArrayList<>();
//        productions.add(production);
//        category = new Category();
//        category.setFoods(productions);
//        category.setType(2);
//        category.setName("好吃");
//        categories.add(category);
////        productionDtos.setCategories(categories);
//        productionDtosList.add(productionDtos);
//        return productionDtosList;
//    }
}
