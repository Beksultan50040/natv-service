package kg.megacom.natvservice.models.json;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ChannelDto {

    private Long id;
    private String name;
    private String photo;
    private double price;

    private List<DiscountDto> discountDtos;

    public ChannelDto(Long id, String name, String photo, double price) {
        this.id = id;
        this.name = name;
        this.photo = photo;
        this.price = price;
    }
}
