function ZerosToEnd(arr) {
    let count = 0;
    for (let i=0; i<arr.length; i++) 
        if (arr[i] != 0) { 
            arr[count++] = arr[i]
        };
    for (i = 0; count<arr.length; count++) {
        arr[count] = 0
    };
    return arr;
}

console.log(ZerosToEnd([1, 2, 0, 0, 4, 0, 5]));
console.log(ZerosToEnd([0, 0, 2, 0, 5]));
console.log(ZerosToEnd([4, 4, 5]));
console.log(ZerosToEnd([0, 0]));


function shiftToRight(num, power) {
    while (power-- > 0) num = Math.floor(num/2);
    return num;
}

console.log(shiftToRight(80, 3));
console.log(shiftToRight(-24, 2));
console.log(shiftToRight(-5, 1));
console.log(shiftToRight(4666, 6));
console.log(shiftToRight(3777, 6));
console.log(shiftToRight(-512, 10));