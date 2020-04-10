package com.xuxueli.xxljobexecutorlewy95.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "country")
    private String country;

    @Column(name = "last_update")
    private Date lastUpdate;
}