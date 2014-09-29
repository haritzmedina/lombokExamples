package es.haritzmedina.examples.lombok;

import lombok.Data;

import java.util.List;

/**
 * Created by Haritz Medina on 29/09/2014.
 */
@Data
public class Enterprise {
    private List<Person> people;
    private String name;
}
