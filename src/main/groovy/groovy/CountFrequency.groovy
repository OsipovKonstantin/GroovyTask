package groovy

class CountFrequency {
    def static count(int[] array) {
        def frequencyMap = [:].withDefault{0}
        array.each { element ->
            frequencyMap[element] += 1
        }
        return frequencyMap
    }
}
