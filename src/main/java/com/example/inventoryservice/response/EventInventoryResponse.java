package com.example.inventoryservice.response;
import com.example.inventoryservice.entity.Venue;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ResponseBody;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EventInventoryResponse  {

    private String event;
    private Long capacity;
    private Venue venue;
}
