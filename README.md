# GlideDemo

因为Glide加载图片会将图片缓存到本地，如果url不变则直接读取缓存不会再网络加载
解决方法有两个：
1.每次加载都清理缓存。这是个很垃圾的解决方法，相当于舍弃了缓存这个非常重要的功能。
2.图片地址采用这种：url+?随机数。当图片更换的时候，后台改变随机数就可以，这样你本地就会重新加载网络图片。这是根本解决方法，后台就应该这样设计	