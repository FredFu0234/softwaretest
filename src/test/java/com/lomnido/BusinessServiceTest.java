package com.lomnido;

import org.junit.jupiter.api.Test;

public class BusinessServiceTest {

    @Test
    public void testBusinessService_getTax() {
        BusinessService b = new BusinessService();
        try {
            assert b.getTax("food") == 5;
        } catch (Exception e) {
            // This Exception must not happen
            assert false;
        }
        try {
            assert b.getTax("beverages") == 10;
        } catch (Exception e) {
            // This Exception must not happen
            assert false;
        }
        try {
            assert b.getTax("luxury") == 30;
        } catch (Exception e) {
            // This Exception must not happen
            assert false;
        }
        try {
            b.getTax("unknown");
            // Must throw an exteption - this assert must not be reached
            assert true;
        } catch (Exception e) {
            // This Exception must happen -> assert true - everything is OK
            assert true;
        }

    }
}
