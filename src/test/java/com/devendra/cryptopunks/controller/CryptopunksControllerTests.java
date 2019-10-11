package com.devendra.cryptopunks.controller;

import com.jayway.jsonpath.JsonPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

@TestComponent
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CryptopunksControllerTests {

    @Autowired
    private TestRestTemplate template;

    @Test
    public void testPunkDetailsForSale() {
        String body = template.getForEntity(CryptopunksController.PUNK_SALE_DETAIL_URL + "?id=1", String.class).getBody();

        String gender = JsonPath.parse(body).read("$.gender", String.class);
        assertThat(gender, containsString("Male"));

    }

}
