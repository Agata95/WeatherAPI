package com.javagda25.model;

//      <lastupdate value="2017-01-30T15:50:00"/>

import lombok.*;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "lastupdate")
public class Lastupdate {
    @XmlAttribute(name = "value")
    private LocalDateTime value;
}
