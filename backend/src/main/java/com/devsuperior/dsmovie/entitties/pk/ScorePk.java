package com.devsuperior.dsmovie.entitties.pk;

import com.devsuperior.dsmovie.entitties.Movie;
import com.devsuperior.dsmovie.entitties.User;
import java.io.Serial;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 * A classe que representa o id do Score, a chave primária que une o movie com o user.
 */
@Getter
@Setter
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
}