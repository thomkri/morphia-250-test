package test.thomas.morphia.morphia250test;

import com.mongodb.client.MongoClient;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import dev.morphia.config.MorphiaConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestMorphiaConfiguration {

  @Bean
  Datastore datastore(MongoClient client) {
    return Morphia.createDatastore(client, MorphiaConfig.load().database("thomas-test"));
  }
}
