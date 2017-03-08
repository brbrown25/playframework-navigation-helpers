/**
	* Copyright 2015 Brandon Brown (brbrown25)
	*
	* Licensed under the Apache License, Version 2.0 (the "License");
	* you may not use this file except in compliance with the License.
	* You may obtain a copy of the License at
	*
	* http://www.apache.org/licenses/LICENSE-2.0
	*
	* Unless required by applicable law or agreed to in writing, software
	* distributed under the License is distributed on an "AS IS" BASIS,
	* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	* See the License for the specific language governing permissions and
	* limitations under the License.
	*/
package com.bbrownsound.play.navigation

import play.twirl.api.Html

trait NavigationItem

case class NavigationBar(
		items: Seq[NavigationItem],
		args: Seq[(Symbol, Any)] = Seq()
)

case class NavigationLink(
		text: String = "",
		link: String = "",
		showDivider: Boolean = false,
		fontIcon: Option[String] = None,
		hideLinkText: Boolean = false,
		args: Seq[(Symbol, Any)] = Seq()
) extends NavigationItem

case class NavigationDropDownLink(
		text: String = "",
		links: Seq[NavigationLink] = Seq(),
		fontIcon: Option[String] = None,
		hideLinkText: Boolean = false,
		args: Seq[(Symbol, Any)] = Seq()
) extends NavigationItem

case class NavigationHtmlRaw(html: Html) extends NavigationItem