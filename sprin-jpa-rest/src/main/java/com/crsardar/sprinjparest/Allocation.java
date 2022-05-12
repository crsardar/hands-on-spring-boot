package com.crsardar.sprinjparest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Allocation {
    @Id
    @GeneratedValue
    private Long id;
    private Long assetId;
    private Long nomineeId;
    private Double allocationPercentage;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
}
