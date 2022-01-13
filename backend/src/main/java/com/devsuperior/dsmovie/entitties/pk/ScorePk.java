package com.devsuperior.dsmovie.entitties.pk;

import com.devsuperior.dsmovie.entitties.Movie;
import com.devsuperior.dsmovie.entitties.User;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;

@Data
@Embeddable
public class ScorePk implements Serializable {

  @Serial
  private static final long serialVersionUID = 1L;

  @ManyToOne
  @JoinColumn(name = "movie_id")
  private Movie movie;
  @ManyToOne
  @JoinColumn(name = "user_id")
  private User user;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    ScorePk scorePk = (ScorePk) o;

    if (!Objects.equals(movie, scorePk.movie)) {
      return false;
    }
    return Objects.equals(user, scorePk.user);
  }

  @Override
  public int hashCode() {
    int result = movie != null ? movie.hashCode() : 0;
    result = 31 * result + (user != null ? user.hashCode() : 0);
    return result;
  }
}