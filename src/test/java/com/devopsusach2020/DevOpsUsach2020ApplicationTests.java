package com.devopsusach2020;

import com.devopsusach2020.rest.RestData;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class DevOpsUsach2020ApplicationTests {
    @Test
    void contextLoads() {
        RestData r =new RestData();
        assertThat(r.getData("asas")).isNotNull();
    }
}