package pl.kuziow.PokemonAttackType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

  private int userId;
  private int id;
  private String title;
  private String body;
  public Result() {

  }

  @Override
  public String toString() {
    return "Result{" +
            "userId=" + userId +
            ", id=" + id +
            ", title='" + title + '\'' +
            ", body='" + body + '\'' +
            '}';
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }
}