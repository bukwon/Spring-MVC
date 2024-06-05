package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// @Data data 어노테이션은 핵심 앤티티에 사용하기 위험
@Getter
@Setter
public class Item {
    private Long id;
    private String itemName;
    private Integer price;
    private int quantity;

    public Item() {

    }

    public Item(String itemName, Integer price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
