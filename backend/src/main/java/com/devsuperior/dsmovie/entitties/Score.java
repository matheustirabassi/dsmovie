package com.devsuperior.dsmovie.entitties;

import com.devsuperior.dsmovie.entitties.pk.ScorePk;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_score")
public class Score {

  @EmbeddedId
  private ScorePk id = new ScorePk();
  private Double value;

  public void setMovie(Movie movie) {
    id.setMovie(movie);
  }

  public void setUser(User user) {
    id.setUser(user);
  }

}