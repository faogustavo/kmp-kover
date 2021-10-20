import SwiftUI
import shared

struct ContentView: View {
	let greet = Greeting().greeting()

	var body: some View {
		Text(greet)
	}
}

#if !TESTING
struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
        ContentView()
	}
}
#endif
