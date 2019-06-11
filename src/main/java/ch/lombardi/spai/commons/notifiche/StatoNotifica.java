package ch.lombardi.spai.commons.notifiche;

import com.holonplatform.core.i18n.Caption;

public enum StatoNotifica {

	@Caption(value = "Inserita", messageCode = "spai.model.sys.destinatario_notifica.stato.created")
	CREATED,
	
	@Caption(value = "Sospesa", messageCode = "spai.model.sys.destinatario_notifica.stato.suspended")
	SUSPENDED,
	
	@Caption(value = "Inviata", messageCode = "spai.model.sys.destinatario_notifica.stato.notified")
	NOTIFIED,
	
	@Caption(value = "Errore", messageCode = "spai.model.sys.destinatario_notifica.stato.error")
	ERROR
	
}
