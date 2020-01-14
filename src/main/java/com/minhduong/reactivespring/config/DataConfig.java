package com.minhduong.reactivespring.config;


import com.mongodb.reactivestreams.client.MongoClient;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.ReactiveMongoDatabaseFactory;
import org.springframework.data.mongodb.core.ReactiveMongoOperations;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.SimpleReactiveMongoDatabaseFactory;

@Profile(value = "local")
@Configuration
@Import(EmbeddedMongoAutoConfiguration.class)
public class DataConfig {
    public static final String DATEBASE_NAME = "reservations";

    @Bean
    public ReactiveMongoDatabaseFactory mongoDatabaseFactory (MongoClient mongoClient) {
        return new SimpleReactiveMongoDatabaseFactory(mongoClient, DATEBASE_NAME);
    }

    @Bean
    public ReactiveMongoOperations reactiveMongoOperations (ReactiveMongoDatabaseFactory reactiveMongoDatabaseFactory) {
        return new ReactiveMongoTemplate(reactiveMongoDatabaseFactory);
    }
}
