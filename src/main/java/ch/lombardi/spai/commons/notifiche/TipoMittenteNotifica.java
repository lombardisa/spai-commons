package ch.lombardi.spai.commons.notifiche;

import com.holonplatform.core.i18n.Caption;

public enum TipoMittenteNotifica {

	@Caption(value = "Sistema", messageCode = "spai.model.sys.notifica.tipo_mittente.system")
	SISTEM,

	@Caption(value = "Funzione", messageCode = "spai.model.sys.notifica.tipo_mittente.function")
	FUNCTION,

	@Caption(value = "Utente", messageCode = "spai.model.sys.notifica.tipo_mittente.user")
	USER

}
