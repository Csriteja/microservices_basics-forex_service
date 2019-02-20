package com.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class ExchangeValue {

    @Id
    private long id;

    @Column(name="currency_from")
    private String from;

    @Column(name="currency_to")
    private String to;

    @Column(name="conversion_multiple")
    private int conversionMultiple;

    private int port;

    public ExchangeValue() {

    }

    public ExchangeValue(Long id, String from, String to, int ConversionMultiple ) {
        super();
        this.id=id;
        this.from=from;
        this.to=to;
        this.conversionMultiple = ConversionMultiple;
    }

    public long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getConversionMultiple() {
        return conversionMultiple;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
