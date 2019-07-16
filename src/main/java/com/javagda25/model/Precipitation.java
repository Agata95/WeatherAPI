package com.javagda25.model;

//      <precipitation mode="no"/>

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "precipitation")
public class Precipitation {
    @XmlAttribute(name = "mode")
    private String mode;
}
