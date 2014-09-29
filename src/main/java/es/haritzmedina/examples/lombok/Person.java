package es.haritzmedina.examples.lombok;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by Haritz Medina on 29/09/2014.
 */
@ToString
@AllArgsConstructor
public class Person {
    @Getter @Setter
    protected String firstName;
    @Getter @Setter
    protected String lastName;
}
