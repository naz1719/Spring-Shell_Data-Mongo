package org.shell.botscrew.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by nazar on 28.03.17.
 */
@Configuration
@EnableMongoRepositories(basePackages = "org.shell.botscrew.repository")
class ApplicationConfig extends AbstractMongoConfiguration {

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient();
    }

    @Override
    protected String getDatabaseName() {
        return "springdata";
    }
}