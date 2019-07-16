package com.javagda25.model;

import lombok.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// przykładowy szkic:
//
// <current>
//      <city id="2643743" name="London">
//          <coord lon="-0.13" lat="51.51"/>
//          <country>GB</country>
//          <sun rise="2017-01-30T07:40:36" set="2017-01-30T16:47:56"/>
//      </city>
//      <temperature value="280.15" min="278.15" max="281.15" unit="kelvin"/>
//      <humidity value="81" unit="%"/>
//      <pressure value="1012" unit="hPa"/>
//      <wind>
//          <speed value="4.6" name="Gentle Breeze"/>
//          <gusts/>
//          <direction value="90" code="E" name="East"/>
//      </wind>
//      <clouds value="90" name="overcast clouds"/>
//      <visibility value="10000"/>
//      <precipitation mode="no"/>
//      <weather number="701" value="mist" icon="50d"/>
//      <lastupdate value="2017-01-30T15:50:00"/>
// </current>
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement(name="current")
public class Current {
    @XmlElement(name = "city")
    private City city;

    @XmlElement(name = "temperature")
    private Temperature temperature;

    @XmlElement(name = "humidity")
    private Humidity humidity;

    @XmlElement(name = "pressure")
    private Pressure pressure;

    @XmlElement(name = "wind")
    private Wind wind;

    @XmlElement(name = "clouds")
    private Clouds clouds;

    @XmlElement(name = "visibility")
    private Visibility visibility;

    @XmlElement(name = "precipitation")
    private Precipitation precipitation;

    @XmlElement(name = "weather")
    private Weather weather;

    @XmlElement(name = "lastupdate")
    private Lastupdate lastupdate;
}
