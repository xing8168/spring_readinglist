@RestController
class Queen {
    @RequestMapping("/")
    def hello() {
	return "we are the champions"
    }
}
