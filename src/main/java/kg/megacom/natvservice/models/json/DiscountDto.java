package kg.megacom.natvservice.models.json;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

public class DiscountDto {
    private int minDays;
    private double percent;

    public DiscountDto(int minDays, double percent) {
        this.minDays = minDays;
        this.percent = percent;
    }
}
