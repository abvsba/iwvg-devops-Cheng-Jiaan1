package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {

    Stream<Double> findDecimalImproperFractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream())
                .filter(Fraction::isImproper)
                .map(Fraction::decimal);
    }

    Stream<Double> findDecimalFractionByNegativeSignFraction() {
        return new UsersDatabase().findAll()
                .flatMap(user -> user.getFractions().stream()
                        .map(Fraction::decimal)
                        .filter(decimal -> decimal < 0));
    }

}
