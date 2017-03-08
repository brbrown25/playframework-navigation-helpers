package navigation

case class BreadCrumb(
		link: String,
		name: String,
		args: Seq[(Symbol, Any)] = Seq()
)