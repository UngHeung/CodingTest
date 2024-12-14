function solution(numbers) {
  numbers
    .sort((a, b) => {
      a+=''; b+='';
      return (b + a) * 1 - (a + b) * 1;
    }).join();
  return numbers[0] ? numbers.join('') : '0';
}