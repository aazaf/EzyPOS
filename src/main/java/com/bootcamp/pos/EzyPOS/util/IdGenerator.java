package com.bootcamp.pos.EzyPOS.util;

import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Mohamed Aazaf <aazafmax2@gmail.com> (www.aazafbiz.web.app)
 * @since 12/19/22
 */

@Service
public class IdGenerator {

    private final Random RANDOM = new Random();
    private final String RESOURCE = "0123456789abcdefghijklmnopqrstuvwxyz";

    public String generateId(int length) {
        StringBuilder simpleId = new StringBuilder();
        for (int i = 0; i < length; i++) {
            simpleId.append(RESOURCE.charAt(RANDOM.nextInt(35)));
        }
        return simpleId.toString();
    }
}
