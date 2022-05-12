package com.crsardar.sprinjparest;

import com.fasterxml.jackson.annotation.JsonValue;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;


@Entity
public class Assets {

    @Id
    @GeneratedValue
    private Long id;
    private AssetsType assetsType;
    private String assetSubType;
    private String name;
    private Double value;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;

    @ManyToMany
    @JoinTable(
            name = "allocation",
            joinColumns = @JoinColumn(name = "asset_id"),
            inverseJoinColumns = @JoinColumn(name = "nominee_id"))
    private Set<Nominee> nominees;

    public Set<Nominee> getNominees() {
        return nominees;
    }

    public void setNominees(Set<Nominee> nominees) {
        this.nominees = nominees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AssetsType getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(AssetsType assetsType) {
        this.assetsType = assetsType;
    }

    public String getAssetSubType() {
        return assetSubType;
    }

    public void setAssetSubType(String assetSubType) {
        this.assetSubType = assetSubType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDateTime getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(LocalDateTime createdTime) {
        this.createdTime = createdTime;
    }

    public LocalDateTime getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(LocalDateTime updatedTime) {
        this.updatedTime = updatedTime;
    }

    public enum AssetsType {
        FD("FD");
        private String name;

        private AssetsType(String name) {
            this.name = name;
        }

        @JsonValue
        public String getName() {
            return name;
        }
    }
}
