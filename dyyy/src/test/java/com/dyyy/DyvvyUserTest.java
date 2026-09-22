package com.dyyy;

import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DyvvyUserTest {
    
    @Test 
    public void testFirstName(){
        DyvvyUser user = new DyvvyUser("Jaden", "Liv","JayLiv","Live100", Role.admin, 4233);

        assertEquals("Jaden", user.getFirst());
    }

    @Test
    public void testLastName(){
        DyvvyUser user = new DyvvyUser("Jaden", "Liv","JayLiv","Live100", Role.admin, 4233);

        assertEquals("Liv", user.getLast());
    }

    @Test
    public void multpleUsersFirst(){
        DyvvyUser user = new DyvvyUser("Jaden", "Liv","JayLiv","Liv100", Role.admin, 4233);
        DyvvyUser user1 = new DyvvyUser("Jada", "Love","JayLove","Love100", Role.admin, 4234);
        DyvvyUser user2 = new DyvvyUser("Janice", "Loathe","JLoathe","Loathe100", Role.admin, 4235);

        assertEquals("Jaden", user.getFirst());
        assertEquals("Jada", user1.getFirst());
        assertEquals("Janice", user2.getFirst());
    }

    @Test
    public void testUserName(){
        DyvvyUser user = new DyvvyUser("Jaden", "Liv","JayLiv","Live100", Role.admin, 4233);

        assertEquals("JayLiv", user.getUserN());
    }
    
    @Test
    public void testPassword(){
        DyvvyUser user = new DyvvyUser("Jaden", "Liv","JayLiv","Live100", Role.admin, 4233);

        assertEquals("Live100", user.getPassW());
    }

    @Test
    public void testAdmin(){
        DyvvyUser user = new DyvvyUser("Jaden", "Liv","JayLiv","Live100", Role.admin, 4233);

        assertEquals(Role.admin, user.getRole());
    }

    @Test
    public void testSecurityKey(){
        DyvvyUser user = new DyvvyUser("Jaden", "Liv","JayLiv","Live100", Role.admin, 4233);

        assertEquals(4233, user.getSecKey());
    }
}
