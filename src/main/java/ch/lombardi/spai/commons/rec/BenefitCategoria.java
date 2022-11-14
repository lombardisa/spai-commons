package ch.lombardi.spai.commons.rec;

import java.io.Serializable;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * Java Interface: BenefitCategoria.java
 * 
 * @author Matteo Maddes
 * @version 28.11.2022
 */
@JsonDeserialize(as = BenefitCategoriaImpl.class)
public interface BenefitCategoria extends Serializable {

	/**
	 * Returns the ID_BENEFIT_CATEGORIA.
	 * 
	 * @return: the ID_BENEFIT_CATEGORIA.
	 */
	Integer getBenefitCategoriaId();

	/**
	 * Returns the TITOLO of ID_BENEFIT_CATEGORIA.
	 * 
	 * @return: the TITOLO of ID_BENEFIT_CATEGORIA.
	 */
	String getTitolo();

	/**
	 * Returns the DESCRIZIONE of the ID_BENEFIT_CATEGORIA.
	 * 
	 * @return: the DESCRIZIONE of the ID_BENEFIT_CATEGORIA.
	 */
	String getDesc();
}