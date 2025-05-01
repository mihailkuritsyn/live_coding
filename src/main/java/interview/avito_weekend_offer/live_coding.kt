//package interview.avito_weekend_offer
//
//class live_coding {
//}
//
//У нас есть набор билетов, из которых можно построить единственный неразрывный маршрут. Петель и повторов в маршруте нет.
//
//Напишите функцию, которая должна вернуть билеты в порядке следования по маршруту.
//
//// Пример 1
//// ввод
//tickets = [
//{ from: 'London', to: 'Moscow' },
//{ from: 'NY', to: 'London' },
//{ from: 'Moscow', to: 'SPb' },
//]
//// вывод
//route = [
//{ from: 'NY', to: 'London' },
//{ from: 'London', to: 'Moscow' },
//{ from: 'Moscow', to: 'SPb' },
//]
//
//ny - start
//Moscow,  { from: 'London', to: 'Moscow' },
//London, { from: 'NY', to: 'London' },
//SPb, { from: 'Moscow', to: 'SPb' },
//
//ny - start
//London,  { from: 'London', to: 'Moscow' },
//NY, { from: 'NY', to: 'London' },
//Moscow, { from: 'Moscow', to: 'SPb' },
//
//{ from: 'NY', to: 'London' },
//
//// Сложность
//// O(n)
//// O(n)
//
//fun (tickets: Map<String, String>): List<Entry<String, String>> {
//    if (tickets.size == 0){
//        return emptyList()
//    }
//    if(tickets.size == 1){
//        return ArrayList(tickets.entrySet)
//    }
//    val values = HashSet(tickets.values)
//    var start: Entry<String, String>
//    for(entry in tickets.entrySet){
//        if(!values.contains(entry.key)){
//            start = entry
//            break
//        }
//    }
//
//    val keyToEntryMap : Map<String, Entry<String, String>> = HashMap()
//    for(entry in tickets.entrySet){
//        keyToEntryMap.put(entry.key, entry)
//    }
//
//
//    // start = 'NY'
//    val res : List<Entry<String, String>> = ArrayList
//    res.add(start)
//    while(tickets.containsKey(start.key)){
//        res.add(keyToEntryMap[start.value])
//        start = tickets.getEntry(start.val)
//    }
//    return res
//}
//
//Дан массив чисел nums и некоторое неизвестное науке число k. Нужно написать функцию, которая вынимает k самых больших чисел из массива nums.
//# ввод
//nums = [100, 50, 0, 150, 100, 0, -30, 70]
//k = 3
//# ожидаемый вывод (в любом порядке)
//expected = [100, 150, 100]
//
//// Сложность
//// O(N*logN)
//// O(N)
//
//fun getTopK(arr: IntArray, k: Int): IntArray{
//    if(k >= arr.size){
//        return arr
//    }
//    Arrays.sort(arr)
//    val res = IntArray(k)
//    Arrays.copy(arr, res, 0, k)
//    // for k
//    // arr to res
//    return res
//}
//
//// k - читаем один раз, и не можем положить