

package com.boris.test01; 
import junitx.extensions.EqualsHashCodeTestCase;


public class MoneyEqualsTestWithJUnitAddons
    extends EqualsHashCodeTestCase {
       
    public MoneyEqualsTestWithJUnitAddons(String name) {
        super(name);
    }
    protected Object createInstance() throws Exception {
        return Money.dollars(100);
    }
    protected Object createNotEqualInstance() throws Exception {
        return Money.dollars(200);
    }
}
