extension String {
    func get(n:Int) -> Character {
        return self[self.index(self.startIndex, offsetBy: n)]
    }
}
