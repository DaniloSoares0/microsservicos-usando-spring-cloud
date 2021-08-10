package br.com.dio.shoppingcart.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@Data
@RedisHash("cart")
public class Cart {

    @Id
    private Integer id;
    private List<Item> item;


}
