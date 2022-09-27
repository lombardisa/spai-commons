package ch.lombardi.spai.commons.rec;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = SedeImpl.class)
public interface Sede extends Serializable {

	Integer getSedeId();

	Integer getSocietaId();

	String getDescSede();

	String getNomeIndirizzo();

	String getLocalita();

	LocalDate getDataChiusura();

}
