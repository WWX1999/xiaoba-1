package com.xiaoba.xiaobasearch.service;

import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.io.IOException;

@SpringBootTest
public class SearchServiceImplTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @Test
    public void testCreateIndex() throws IOException {
        CreateIndexRequest createIndexRequest=new CreateIndexRequest("test_index");
        CreateIndexResponse response= restHighLevelClient.indices().create(createIndexRequest, RequestOptions.DEFAULT);
        System.out.print(response);
    }
}