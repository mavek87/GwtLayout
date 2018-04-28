package com.matteoveroni.gwtlayout.client.layout.widgets.footer;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.FlowPanel;
import elemental2.dom.HTMLElement;

public final class GwtLayoutFooter extends FlowPanel {

	private final Element footerElement = getElement();
	private final Element footerContentElement = new FlowPanel().getElement();

	public GwtLayoutFooter() {
		super("footer");
		footerElement.setId("gwt-layout-footer");
		footerContentElement.setId("gwt-layout-footer-content");
		footerElement.appendChild(footerContentElement);
	}

	public void setHTMLContent(HTMLElement html) {
		footerContentElement.setInnerHTML(html.textContent);
	}

	public void setHTMLContent(String html) {
		footerContentElement.setInnerHTML(html);
	}
}
