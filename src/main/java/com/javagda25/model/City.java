package com.javagda25.model;

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// <city id="2643743" name="London">
//      <coord lon="-0.13" lat="51.51"/>
//      <country>GB</country>
//      <sun rise="2017-01-30T07:40:36" set="2017-01-30T16:47:56"/>
// </city>

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "city")
public class City {
    @XmlAttribute(name = "id")
    private String id;

    @XmlAttribute(name = "name")
    private String name;

    @XmlElement(name = "coord")
    private Coord coord;

    @XmlElement(name = "country")
    private String country;

    @XmlElement(name = "sun")
    private Sun sun;
}
