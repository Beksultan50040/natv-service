package kg.megacom.natvservice.models.json;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class DiscountDto {
    private int minDays;
    private int percent;

    public DiscountDto(int minDays, int percent) {
        this.minDays = minDays;
        this.percent = percent;
    }
}
