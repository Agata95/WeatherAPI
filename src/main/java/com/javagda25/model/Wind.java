package com.javagda25.model;

//      <wind>
//          <speed value="4.6" name="Gentle Breeze"/>
//          <gusts/>
//          <direction value="90" code="E" name="East"/>
//      </wind>

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name = "wind")
public class Wind {
    @XmlElement(name = "speed")
    private Speed speed;

    @XmlElement(name = "gusts")
    private Object gusts;

    @XmlElement(name = "direction")
    private Direction direction;
}
