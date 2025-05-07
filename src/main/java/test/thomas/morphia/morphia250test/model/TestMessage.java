package test.thomas.morphia.morphia250test.model;

import dev.morphia.annotations.CappedAt;
import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Indexed;
import dev.morphia.annotations.Version;
import org.bson.types.ObjectId;

@Entity(value = "test-messages",
    useDiscriminator = false,
    cap = @CappedAt(value = 343597383680L, count = 200000000L))
public class TestMessage {

  @Id
  private ObjectId id;
  @Version
  private Long version;
  @Indexed
  private String name;
  private String value;

  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
