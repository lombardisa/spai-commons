package ch.lombardi.spai.commons.notifiche;

import com.holonplatform.core.i18n.Caption;

public enum CategoriaNotifica {

	@Caption(value = "Informazione", messageCode = "spai.model.sys.notifica.categoria.info")
	INFO,
	
	@Caption(value = "Avvertenza", messageCode = "spai.model.sys.notifica.categoria.warning")
	WARNING,
	
	@Caption(value = "Errore", messageCode = "spai.model.sys.notifica.categoria.error")
	ERROR
	
}
