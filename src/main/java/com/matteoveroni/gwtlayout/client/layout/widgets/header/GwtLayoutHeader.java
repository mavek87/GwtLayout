package com.matteoveroni.gwtlayout.client.layout.widgets.header;

import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.FlowPanel;
import elemental2.dom.HTMLElement;

public final class GwtLayoutHeader extends FlowPanel {

	private final Element headerElement = getElement();
	private final Element headerContentElement = new FlowPanel().getElement();

	public GwtLayoutHeader() {
		super("header");
		headerElement.setId("gwt-layout-header");
		headerContentElement.setId("gwt-layout-header-content");
		headerElement.appendChild(headerContentElement);
	}

	public void setHTMLContent(HTMLElement html) {
		headerContentElement.setInnerHTML(html.textContent);
	}

	public void setHTMLContent(String html) {
		headerContentElement.setInnerHTML(html);
	}
}
