const listHello =
    ["Chào buổi sáng, chào ngày mới, chào sự khởi đầu mới, mong ước mới, hy vọng mới.",
     "Một ngày mới mang theo những hy vọng mới, hãy cười tươi lên nhé.",
     "Những tia nắng của ngày hôm nay cho bạn thấy cơ hội mới để thực hiện giấc mơ đã ấp ủ bấy lâu nay. Ta phải nắm bắt cơ hội, làm việc chăm chỉ và theo đuổi mơ ước của mình nhé.",
     "Mặt trời đã hé rạng đằng Đông và những con chim đang hót vui vẻ. Bươm bướm đang bay lượn quanh những cành hoa, đã đến lúc ta nên dậy và ngáp một cái thật to nào. Chúc mọi người ngày mới tốt lành!",
     "Sương mai long lanh trên cành, hoa nở, chim hót đầy sức sống, ta hãy đứng dậy và bước đi vững chắc trong ngày mới và những hy vọng cho tương lai của bạn nhé.",
     "Mỗi bài học đều đáng quý. Hãy chắc chắn rằng bạn học được điều mới mẻ mỗi ngày. Chúc bạn buổi sáng tràn đầy năng lượng."];
var i = 0, speed = 50;

const title = listHello[Math.floor(Math.random() * listHello.length)];
function typeWriter() {
    if (i < title.length) {
        document.getElementById("title").innerHTML += title.charAt(i);
        i++;
        setTimeout(typeWriter, speed);
    }
}
typeWriter();